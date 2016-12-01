/*
 * CurrencyBG App
 * Copyright (C) 2016 Vexelon.NET Services
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.vexelon.currencybg.app.common;

import java.util.Locale;

import android.content.Context;

public enum CurrencyLocales {
	BG,
	EN;

	public static CurrencyLocales getAppLocale(Context context) {
		Locale currentLocale = context.getResources().getConfiguration().locale;
		if (currentLocale.getLanguage().equalsIgnoreCase("bg")) {
			return BG;
		}
		// default
		return EN;
	}
}
