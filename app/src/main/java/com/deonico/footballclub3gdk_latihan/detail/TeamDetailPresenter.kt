package com.deonico.footballclub3gdk_latihan.detail

import com.deonico.footballclub3gdk_latihan.api.ApiRepository
import com.deonico.footballclub3gdk_latihan.api.TheSportDBApi
import com.deonico.footballclub3gdk_latihan.model.TeamResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by root on 2/3/18.
 */
class TeamDetailPresenter(private val view: TeamDetailView,
                          private val apiRepository: ApiRepository,
                          private val gson: Gson) {

    fun getTeamDetail(teamId: String) {
        view.showLoading()
       doAsync{
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getTeamDetail(teamId)),
                    TeamResponse::class.java
            )

           uiThread {
               view.hideLoading()
               view.showTeamDetail(data.teams)
           }
        }
    }
}