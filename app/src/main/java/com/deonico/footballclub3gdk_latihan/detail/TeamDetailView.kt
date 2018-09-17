package com.deonico.footballclub3gdk_latihan.detail

import com.deonico.footballclub3gdk_latihan.model.Team

/**
 * Created by root on 2/3/18.
 */

interface TeamDetailView {
    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(data: List<Team>)
}