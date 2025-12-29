package pl.gov.coi.common.ui.ds.supportpage.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowData
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowListData
import pl.gov.coi.common.ui.ds.supportpage.SupportPageData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class SupportPagePreviewParameterProvider : CustomPreviewParameterProvider&lt;SupportPageData&lt;*&gt;&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SupportPageData&lt;*&gt;&gt;&gt;
    get() = sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot;SupportPageData&quot;,
        value = SupportPageData(
          topBarTitle = &quot;Top bar title&quot;.toLabel(),
          topBarIconMainResId = null,
          onTopBarIconMainClick = null,
          topBarIconMenuResId = null,
          onTopBarIconMenuClick = null,
          iconResId = R.drawable.ag005_globe,
          iconContentDescription = Label.EMPTY,
          title = &quot;Title Size XXL medium 24 Color - black 900&quot;.toLabel(),
          message = &quot;Description text Size - M, Color - grey 900&quot;.toLabel(),
          contentData = Unit,
          buttonData = null,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;SupportPageDataExample&quot;,
        value = SupportPageData(
          topBarTitle = &quot;Wybierz język&quot;.toLabel(),
          topBarIconMainResId = R.drawable.ab004_arrow_left,
          onTopBarIconMainClick = {},
          topBarIconMenuResId = null,
          onTopBarIconMenuClick = null,
          iconResId = R.drawable.ag005_globe,
          iconContentDescription = Label.EMPTY,
          title = &quot;Top bar title&quot;.toLabel(),
          message = &quot;Nie można zmienić języka w Ustawieniach.&quot;.toLabel(),
          contentData = InfoRowListData(
            items = listOf(
              InfoRowData.Bullet(
                description = &quot;Support text\nSIZE M: Roboto Normal Gray 900&quot;.toLabel(),
              ),
              InfoRowData.Bullet(
                description = &quot;Support text\nSIZE M: Roboto Normal Gray 900&quot;.toLabel(),
              ),
            ),
          ),
          buttonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(
              label = &quot;Dalej&quot;.toLabel(),
            ),
            onClick = {},
          ),
        ),
      ),
    )
}
