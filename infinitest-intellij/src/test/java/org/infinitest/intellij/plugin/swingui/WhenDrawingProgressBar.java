/*
 * Infinitest, a Continuous Test Runner.
 *
 * Copyright (C) 2010-2013
 * "Ben Rady" <benrady@gmail.com>,
 * "Rod Coffin" <rfciii@gmail.com>,
 * "Ryan Breidenbach" <ryan.breidenbach@gmail.com>
 * "David Gageot" <david@gageot.net>, et al.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.infinitest.intellij.plugin.swingui;

import static java.awt.Color.*;
import static org.fest.assertions.Assertions.*;

import org.junit.*;

public class WhenDrawingProgressBar {
  private FakeGraphics2D graphics;

  @Before
  public void inContext() {
    graphics = new FakeGraphics2D();
  }

  @Test
  public void shouldUseWhiteFontIfBarIsBlack() {
    CustomProgressBar progressBar = new CustomProgressBar();
    progressBar.setForeground(BLACK);

    progressBar.drawText(graphics);

    assertThat(graphics.getColor()).isEqualTo(WHITE);
  }

  @Test
  public void shouldUseBlackFontIfBarIsGreen() {
    CustomProgressBar progressBar = new CustomProgressBar();
    progressBar.setForeground(GREEN);

    progressBar.drawText(graphics);

    assertThat(graphics.getColor()).isEqualTo(BLACK);
  }
}
