/*
 * Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.view.themed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

import org.mariotaku.twidere.view.iface.IThemeAccentView;

/**
 * Created by mariotaku on 15/4/25.
 */
public class ThemedAccentSwipeRefreshLayout extends SwipeRefreshLayout implements IThemeAccentView {
    public ThemedAccentSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThemedAccentSwipeRefreshLayout(Context context) {
        super(context);
    }

    @Override
    public void setAccentTintColor(@NonNull ColorStateList color) {
        setColorSchemeColors(color.getDefaultColor());
    }
}
