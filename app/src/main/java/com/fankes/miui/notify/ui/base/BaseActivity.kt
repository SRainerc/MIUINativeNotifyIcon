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
 * This file is Created by fankes on 2022/1/30.
 */
package com.fankes.miui.notify.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fankes.miui.notify.R
import com.fankes.miui.notify.utils.isNotSystemInDarkMode
import com.gyf.immersionbar.ktx.immersionBar

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** 隐藏系统的标题栏 */
        supportActionBar?.hide()
        /** 初始化沉浸状态栏 */
        immersionBar {
            statusBarColor(R.color.colorThemeBackground)
            autoDarkModeEnable(true)
            statusBarDarkFont(isNotSystemInDarkMode)
            navigationBarColor(R.color.colorThemeBackground)
            navigationBarDarkIcon(isNotSystemInDarkMode)
            fitsSystemWindows(true)
        }
    }
}