package com.deonico.footballclub3gdk_latihan.teams

import com.deonico.footballclub3gdk_latihan.model.Team

interface TeamsView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}