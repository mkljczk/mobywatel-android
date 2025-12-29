package pl.gov.coi.common.ui.ds.servicewelcomepage.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.alert.AlertData
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.header.HeaderData
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowData
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowListData
import pl.gov.coi.common.ui.ds.servicewelcomepage.ServiceWelcomePageData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class ServiceWelcomePagePreviewParameterProvider : CustomPreviewParameterProvider&lt;ServiceWelcomePageData&lt;*&gt;&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ServiceWelcomePageData&lt;*&gt;&gt;&gt;
    get() = sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot;ServiceWelcomePageData&quot;,
        value = ServiceWelcomePageData(
          topBarTitle = &quot;Top bar title&quot;.toLabel(),
          topBarIconMainResId = R.drawable.ab004_arrow_left,
          onTopBarIconMainClick = {},
          topBarIconMenuResId = R.drawable.c1_info,
          onTopBarIconMenuClick = {},
          headerData = HeaderData(
            iconResId = R.drawable.da015_historia_pojazdu,
            iconColorProvider = { AppTheme.colors.headerCeladon100 },
            iconBackgroundColorProvider = { AppTheme.colors.headerGrass30 },
            title = &quot;Title Size XXL Color - black 900&quot;.toLabel(),
            message = &quot;Description text Size - M, Color - grey 900&quot;.toLabel(),
          ),
          contentData = Unit,
          buttonData = null,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;ServiceWelcomePageDataWithContent&quot;,
        value = ServiceWelcomePageData(
          topBarTitle = &quot;Top bar title&quot;.toLabel(),
          topBarIconMainResId = R.drawable.ab004_arrow_left,
          onTopBarIconMainClick = {},
          topBarIconMenuResId = R.drawable.c1_info,
          onTopBarIconMenuClick = {},
          headerData = HeaderData(
            iconResId = R.drawable.da015_historia_pojazdu,
            iconColorProvider = { AppTheme.colors.headerCeladon100 },
            iconBackgroundColorProvider = { AppTheme.colors.headerGrass30 },
            title = &quot;Title Size XXL Color - black 900&quot;.toLabel(),
            message = &quot;Description text Size - M, Color - grey 900&quot;.toLabel(),
          ),
          alertData = AlertData.Warning(
            title = &quot;Alert title example&quot;.toLabel(),
            bodyText = &quot;Alert body text&quot;.toLabel(),
            alertContentDescription = Label.EMPTY,
          ),
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
              label = &quot;Sprawdź&quot;.toLabel(),
            ),
            onClick = {},
          ),
        ),
      ),

      ScreenShotTestData(
        screenShotTestName = &quot;ServiceWelcomePageDataWithStepsContent&quot;,
        value = ServiceWelcomePageData(
          topBarTitle = &quot;Top bar title&quot;.toLabel(),
          topBarIconMainResId = R.drawable.ab004_arrow_left,
          onTopBarIconMainClick = {},
          topBarIconMenuResId = R.drawable.c1_info,
          onTopBarIconMenuClick = {},
          headerData = HeaderData(
            iconResId = R.drawable.da015_historia_pojazdu,
            iconColorProvider = { AppTheme.colors.headerCeladon100 },
            iconBackgroundColorProvider = { AppTheme.colors.headerGrass30 },
            title = &quot;Title Size XXL Color - black 900&quot;.toLabel(),
            message = &quot;Description text Size - M, Color - grey 900&quot;.toLabel(),
          ),
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
              label = &quot;Sprawdź&quot;.toLabel(),
            ),
            onClick = {},
          ),
        ),
      ),
    )
}
