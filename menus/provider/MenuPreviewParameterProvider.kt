package pl.gov.coi.common.ui.ds.menus.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.menus.MenuData
import pl.gov.coi.common.ui.ds.menus.MenuItem
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class MenuPreviewParameterProvider : CustomPreviewParameterProvider&lt;MenuData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;MenuData&gt;&gt;
    get() = sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot;Menu&quot;,
        value = provideMenuData(),
      ),
    )

  private fun provideMenuData() = MenuData(
    isMenuVisible = true,
    onMenuClose = {},
    items = listOf(
      MenuItem(
        label = &quot;Opcja 1&quot;.toLabel(),
        leftIconResId = R.drawable.ah001_like,
        rightIconResId = R.drawable.ah001_like,
        onItemClick = {},
      ),
      MenuItem(
        label = &quot;Opcja 2&quot;.toLabel(),
        leftIconResId = R.drawable.aa002_delete,
        rightIconResId = R.drawable.aa002_delete,
        onItemClick = {},
      ),
      MenuItem(
        label = &quot;Opcja 3&quot;.toLabel(),
        leftIconResId = R.drawable.ah002_dislike,
        rightIconResId = R.drawable.ah002_dislike,
        onItemClick = {},
      ),
    ),
  )
}
