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

/** Indicates the relationship between different SecTypes. */
public enum Relationship {
  /**
   * An intersection type.
   *
   * <p>Interseciton types are subtypes of all of the types in the group.
   */
  INTERSECTION,

  /**
   * A union type.
   *
   * <p>Mostly found in loosely structured data files (e.g., XML files, JSON files). Union types can
   * only be used where all of the types in the group can be used and do not necessarily have an
   * indicatio of which type they contain.
   */
  UNION,

  /**
   * A disjoint union type.
   *
   * <p>Similar to a union in type in that they can only be used where all of the types in the group
   * can be used, but they always have an indicator of which type they contain. Like a "oneof" in
   * protobuf.
   */
  DISJOINT_UNION;
}
