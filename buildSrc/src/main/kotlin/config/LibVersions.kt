/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package config

object LibVersions {

    const val autoService = "1.0"
    const val guava = "31.1-jre"

    object Build {
        const val errorprone = "2.11.0"
        const val javaFormat = "1.14.0"
        const val ktlint = "0.44.0"
        const val prettierSortJson = "0.0.2"
    }

    object Test {
        const val assertj = "3.22.0"
        const val assertjGuava = "3.4.0"
        const val junit = "4.13.2"
    }
}