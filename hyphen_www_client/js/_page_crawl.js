;(function(Hyphen, $, undefined){
    
    // On load
	$(document).ready(function(){

        Hyphen.controller.core.crawlJobs_update()

        $('#crawlJobs_refresh').click(Hyphen.controller.core.crawlJobs_update)
        $('#crawlJobs_showFinished').change(Hyphen.view.crawlJobs_drawTable)
        $('#crawlJobs_showPending').change(Hyphen.view.crawlJobs_drawTable)
	})

    // View

    Hyphen.view.crawlJobs_drawTable = function(){
        var jobs = Hyphen.model.crawlJobs.getAll()
            ,showPending = $('#crawlJobs_showPending').is(':checked')
            ,showFinished = $('#crawlJobs_showFinished').is(':checked')
            ,webEntitites_idDisplayed = []
        if(!showFinished){
            jobs = jobs.filter(function(job, i){
                return i<5 || (job.crawling_status.toLowerCase() != "finished" && job.crawling_status.toLowerCase() != "canceled") || job.indexing_status.toLowerCase() != "finished" 
            })
        }
        if(!showPending){
            jobs = jobs.filter(function(job){
                return job.crawling_status.toLowerCase() != "pending"
            })
        }
        jobs.sort(function(a,b){
            return b.timestamp - a.timestamp
        })
        if(jobs.length > 0){
            $('#jobsMessage').html('')
            $('#jobsTable').show()
            $('#jobsTableBody').html('')
            jobs.forEach(function(crawlJob){
                var crawling_colorClass = ''
                    ,indexing_colorClass = ''
                    ,row_colorClass = ''
                webEntitites_idDisplayed.push(crawlJob.webentity_id)

                // Colors
                if(crawlJob.crawling_status.toLowerCase() == "finished")
                    crawling_colorClass = 'label-success'
                else if(crawlJob.crawling_status.toLowerCase().indexOf("crashed") >= 0)
                    crawling_colorClass = 'label-important'
                else if(crawlJob.crawling_status.toLowerCase() == "pending")
                    crawling_colorClass = 'label-warning'
                else if(crawlJob.crawling_status.toLowerCase() == "canceled")
                    crawling_colorClass = 'label-inverse'
                else
                    crawling_colorClass = 'label-info'

                if(crawlJob.indexing_status.toLowerCase() == "finished")
                    indexing_colorClass = 'label-success'
                else if(crawlJob.indexing_status.toLowerCase().indexOf("crashed") >= 0)
                    indexing_colorClass = 'label-important'
                else if(crawlJob.indexing_status.toLowerCase() == "pending")
                    indexing_colorClass = 'label-warning'
                else
                    indexing_colorClass = 'label-info'
                
                if(crawlJob.crawling_status.toLowerCase().indexOf("crashed") >= 0 || crawlJob.indexing_status.toLowerCase().indexOf("crashed") >= 0 || crawlJob.crawling_status.toLowerCase() == "canceled")
                    row_colorClass = 'error'
                else if(crawlJob.crawling_status.toLowerCase() == "finished" && crawlJob.indexing_status.toLowerCase() == "finished")
                    row_colorClass = 'success'
                else if(crawlJob.crawling_status.toLowerCase() == "pending")
                    row_colorClass = 'warning'
                else 
                    row_colorClass = 'info'

                // DOM
                $('#jobsTableBody').append(
                    $('<tr class="'+row_colorClass+' hover" crawljobid="'+crawlJob.id+'"/>').append(
                        $('<td/>').text(crawlJob.webentity_id)
                    ).append(
                        $('<td/>').append(
                            $('<span class="label '+crawling_colorClass+'"/>').text(crawlJob.crawling_status.replace('_', ' ').toLowerCase())
                        )
                    ).append(
                        $('<td/>').append(
                            $('<span class="label '+indexing_colorClass+'"/>').text(crawlJob.indexing_status.replace('_', ' ').toLowerCase())
                        )
                    ).append(
                        $('<td><small>'+crawlJob.nb_pages+' pages<br/>'+crawlJob.nb_links+' links</small></td>')
                    ).append(
                        $('<td style="vertical-align:middle;"><i class="icon-chevron-right icon-white decorating-chevron"/></td>')
                    ).click(function(){
                        Hyphen.controller.core.selectCrawlJob(crawlJob.id)
                    })
                )
            })
        } else {
            $('#jobsMessage').html('<span class="text-info">No crawl job</span>')
            $('#jobsTable').hide()
            $('#jobsTableBody').html('')
        }
    }

    Hyphen.view.crawlJob_drawFrame = function(crawlJob){
        $('#jobsTableBody tr').each(function(i, tr){
            var crawlJob_id = $(tr).attr('crawljobid')
            if(crawlJob_id == crawlJob.id)
                $(tr).addClass("selected")
            else
                $(tr).removeClass("selected")
        })
        var crawling_colorClass = ''
            ,indexing_colorClass = ''
        
        if(crawlJob.crawling_status.toLowerCase() == "finished")
            crawling_colorClass = 'label-success'
        else if(crawlJob.crawling_status.toLowerCase().indexOf("crashed") >= 0)
            crawling_colorClass = 'label-important'
        else if(crawlJob.crawling_status.toLowerCase() == "pending")
            crawling_colorClass = 'label-warning'
        else if(crawlJob.crawling_status.toLowerCase() == "canceled")
            crawling_colorClass = 'label-inverse'
        else
            crawling_colorClass = 'label-info'

        if(crawlJob.indexing_status.toLowerCase() == "finished")
            indexing_colorClass = 'label-success'
        else if(crawlJob.indexing_status.toLowerCase().indexOf("crashed") >= 0)
            indexing_colorClass = 'label-important'
        else if(crawlJob.indexing_status.toLowerCase() == "pending")
            indexing_colorClass = 'label-warning'
        else
            indexing_colorClass = 'label-info'
        
        var noCancel = crawlJob.crawling_status.toLowerCase() == "finished" || crawlJob.crawling_status.toLowerCase() == "crashed" || crawlJob.crawling_status.toLowerCase() == "canceled"
        $('#jobFrame').show()
        $('#jobFrame').html('')
        $('#jobFrame').append(
            $('<h4/>').append(
                $('<span/>').text('Crawling "')
            ).append(
                $('<span/>').text(crawlJob.webentity_id)
            ).append(
                $('<span/>').text('"')
            )
        ).append(
            $('<p/>').append(
                $('<span class="label '+crawling_colorClass+'"/>').text('Harvesting: '+crawlJob.crawling_status.replace('_', ' ').toLowerCase())
            ).append(
                $('<span/>').text(' ')
            ).append(
                $('<span class="label '+indexing_colorClass+'"/>').text('Indexing: '+crawlJob.indexing_status.replace('_', ' ').toLowerCase())
            ).append(
                $('<span/>').text(' ')
            )
        ).append(
            $('<p/>').append(
                $('<strong/>').text("Pages: ")
            ).append(
                $('<span/>').text(crawlJob.nb_pages)
            ).append(
                $('<br/>')
            ).append(
                $('<strong/>').text("Links: ")
            ).append(
                $('<span/>').text(crawlJob.nb_links)
            ).append(
                $('<span/>').text(' ')
            )
        ).append(
            $('<p/>').append(
                $('<a class="btn btn-danger '+((noCancel)?('disabled'):(''))+'"/>').html('<i class="icon-remove-sign icon-white"/> Abort crawl').click(function(){
                    Hyphen.controller.core.crawlJobs_cancel(crawlJob.id)
                })
            ).append(
                $('<span/>').text(' ')
            ).append(
                $('<a class="btn"/>').text('Show in console').click(function(){
                    console.log(crawlJob)
                })
            )
        ).append(
            $('<p/>').append(
                $('<small class="muted"/>').text('Crawl job id: '+crawlJob.id)
            ).append(
                $('<br/>')
            ).append(
                $('<small class="muted"/>').text('Timestamp: '+crawlJob.timestamp)
            ).append(
                $('<span/>').text(' ')
            )
        ).append(
            $('<hr/>')
        ).append(
            $('<h4/>').html('Crawler settings')
        ).append(
            $('<p/>').append(
                $('<strong/>').text("Maximum depth: ")
            ).append(
                $('<span class="badge badge-info"/>').text(crawlJob.crawl_arguments.maxdepth)
            )
        ).append(
            $('<p/>').append(
                $('<strong/>').text("Starting URLs:")
            ).append(
                $('<ul class="unstyled"/>').append(
                    crawlJob.crawl_arguments.start_urls.map(function(d){
                        return $('<li/>').append(
                            $('<a/>').append(
                                $('<small/>').text(d)
                            ).attr('href', d)
                            .attr('target', '_blank')
                        )
                    })
                )
            ).append(
                $('<strong/>').text("Options: ")
            ).append(
                $('<span/>').text(crawlJob.crawl_arguments.setting)
            )
        )
    }

    $(document).on( "/crawls", function(event, eventData){
        switch(eventData.what){
            case "updated":
            
            Hyphen.view.crawlJobs_drawTable()
            if(crawlJob_id = Hyphen.model.uxSettings.get('crawlJob_focused'))
                Hyphen.view.crawlJob_drawFrame(Hyphen.model.crawlJobs.get(crawlJob_id))

            break
        }
    })

    $(document).on( "/crawlJob", function(event, eventData){
        switch(eventData.what){
            case "focusUpdated":
            var crawlJob = Hyphen.model.crawlJobs.get(eventData.crawjJob_id)
            Hyphen.view.crawlJob_drawFrame(crawlJob)
            break
        }
    })



    // Controller

    Hyphen.controller.core.selectCrawlJob = function(job_id){
        Hyphen.model.uxSettings.set('crawlJob_focused', job_id)
        $(document).trigger( "/crawlJob", [{what:'focusUpdated', crawjJob_id:job_id}])
    }




})(window.Hyphen = window.Hyphen || {}, jQuery)