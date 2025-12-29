package pl.gov.coi.common.ui.ds.servicewelcomepage

import androidx.annotation.DrawableRes
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.ds.alert.AlertData
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIconData
import pl.gov.coi.common.ui.ds.header.HeaderData
import pl.gov.coi.common.ui.theme.AppTheme

class ServiceWelcomePageData&lt;CONTENT_DATA&gt;(
  internal val topBarTitle: Label,
  @DrawableRes topBarIconMainResId: Int?,
  topBarIconMainContentDescription: Label = Label.EMPTY,
  onTopBarIconMainClick: (() -&gt; Unit)?,
  @DrawableRes topBarIconMenuResId: Int?,
  onTopBarIconMenuClick: (() -&gt; Unit)?,
  internal val headerData: HeaderData,
  internal val alertData: AlertData? = null,
  internal val contentData: CONTENT_DATA,
  internal val buttonData: ButtonData?,
  internal val pullToRefreshEnabled: Boolean = false,
  internal val refreshAction: () -&gt; Unit = {},
) {

  internal val mainButtonData: ButtonIconData? =
    topBarIconMainResId?.let {
      
      ButtonIconData(
        iconResId = it,
        onClick = onTopBarIconMainClick ?: {},
        iconColorProvider = { AppTheme.colors.neutral200 },
        contentDescription = topBarIconMainContentDescription,
      )
    }

  internal val menuButtonData: ButtonIconData? =
    topBarIconMenuResId?.let {
      
      ButtonIconData(
        iconResId = it,
        onClick = onTopBarIconMenuClick ?: {},
        iconColorProvider = { AppTheme.colors.neutral200 },
      )
    }
}
