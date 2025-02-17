/*
 * MIUINativeNotifyIcon - Fix the native notification bar icon function abandoned by the MIUI development team.
 * Copyright (C) 2019-2022 Fankes Studio(qzmmcn@163.com)
 * https://github.com/fankes/MIUINativeNotifyIcon
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version.
 * <p>
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 *
 * This file is Created by fankes on 2022/1/24.
 */
@file:Suppress("unused")

package com.fankes.miui.notify.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class MNNApplication : Application() {

    companion object {

        /** 全局静态实例 */
        private var context: MNNApplication? = null

        /** 调用全局静态实例 */
        val appContext get() = context ?: error("App is death")

        /** 自身 APP 是否已启动 */
        var isMineStarted = false
    }

    override fun onCreate() {
        super.onCreate()
        /** 设置状态 */
        isMineStarted = true
        /** 设置静态实例 */
        context = this
        /** 跟随系统夜间模式 */
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}