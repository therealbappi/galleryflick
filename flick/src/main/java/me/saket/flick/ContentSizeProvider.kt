package me.saket.flick

interface ContentSizeProvider {

  /**
   * Height of the content with its scale taken into account. This is used for
   * animating the content out of the window when a flick is registered.
   */
  fun heightForDismissAnimation(): Int

  /**
   * Used for calculating if the content can be dismissed on finger up.
   */
  fun heightForCalculatingDismissThreshold(): Int
}
