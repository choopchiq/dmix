/*
 * Copyright (C) 2010-2014 The MPDroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.namelessdev.mpdroid.data.dao.sqlite.exceptions;

public class BaseDBHelperException extends RuntimeException {

    private static final long serialVersionUID = 1899138265936016333L;
    private String cause;

    public BaseDBHelperException() {
        cause = "Unknown cause";
    }

    public BaseDBHelperException(String cause) {
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return cause;
    }
}
