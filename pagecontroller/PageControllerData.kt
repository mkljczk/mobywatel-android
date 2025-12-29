package pl.gov.coi.common.ui.ds.pagecontroller

import pl.gov.coi.common.domain.label.Label

data class PageControllerData&lt;CONTENT_DATA&gt;(
  val contentsData: List&lt;PageData&lt;CONTENT_DATA&gt;&gt;,
) {

  data class PageData&lt;CONTENT_DATA&gt;(
    val content: CONTENT_DATA,
    val isButtonVisible: Boolean,
    val buttonTitle: Label,
    val buttonAction: ButtonAction = ButtonAction.GoToNextPage,
  ) {
    sealed interface ButtonAction {
      data object GoToNextPage : ButtonAction
      fun interface Custom : ButtonAction {
        operator fun invoke()
      }
    }
  }
}
