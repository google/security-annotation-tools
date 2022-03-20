/*
 * Copyright 2021-2022 Google LLC
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
package com.google.secannotations.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.meta.TypeQualifier;

/** A security type containing both a category and some number of tags. */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
  ElementType.METHOD,
  ElementType.PARAMETER,
  ElementType.TYPE,
  ElementType.TYPE_USE,
  ElementType.TYPE_PARAMETER
})
@Repeatable(value = SecTypes.class)
@Inherited
@TypeQualifier
public @interface SecType {
  /** The classification for the security type. */
  Category category();

  /** Any tags that are being used to scope the security type. Order is irrelevant. */
  Tag[] tags();
}
