/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.android.views.visualization.shape;

/**
 * @author damonkohler@google.com (Damon Kohler)
 */
public class PoseShape extends TriangleFanShape {

  private static final Color color = new Color(0.847058824f, 0.243137255f, 0.8f, 1.0f);
  private static final float vertices[] = {
      0.0f, 0.0f, 0.0f, // center
      -0.251f, 0.0f, 0.0f, // bottom
      -0.075f, -0.075f, 0.0f, // bottom right
      0.0f, -0.251f, 0.0f, // right
      0.075f, -0.075f, 0.0f, // top right
      0.510f, 0.0f, 0.0f, // top
      0.075f, 0.075f, 0.0f, // top left
      0.0f, 0.251f, 0.0f, // left
      -0.075f, 0.075f, 0.0f, // bottom left
      -0.251f, 0.0f, 0.0f // bottom again
      };

  public PoseShape() {
    super(vertices, color);
  }
}