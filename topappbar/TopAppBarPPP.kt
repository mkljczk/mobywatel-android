package pl.gov.coi.common.ui.ds.topappbar

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.progressbar.ProgressBarData
import pl.gov.coi.common.ui.ds.topappbar.MenuType.MenuButtonData
import pl.gov.coi.common.ui.ds.topappbar.MenuType.MenuButtonData.MenuIcon
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

private val NOTIFICATION = object : MenuIcon {
  override val iconResId = R.drawable.ab013_notifications
  override val contentDescription = &quot;Powiadomienia&quot;.toLabel(&quot;Powiadomienia&quot;)
}

class TopAppBarPPP : CustomPreviewParameterProvider&lt;TopAppBarData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;TopAppBarData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;MediumTopAppBar&quot;,
      value = getMediumTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeTopAppBar&quot;,
      value = getLargeTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultTopAppBar - Center&quot;,
      value = getSmallDefaultTopAppBar(titleAlignment = TitleAlignment.Center),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultTopAppBar - Left&quot;,
      value = getSmallDefaultTopAppBar(titleAlignment = TitleAlignment.Left),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultIconListTopAppBar - Center&quot;,
      value = getSmallDefaultIconListTopAppBar(titleAlignment = TitleAlignment.Center),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultIconListTopAppBar - Left&quot;,
      value = getSmallDefaultIconListTopAppBar(titleAlignment = TitleAlignment.Left),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultLogoNoTitleTopAppBar&quot;,
      value = getSmallDefaultNoTitleTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultLogoNoActionsTopAppBar&quot;,
      value = getSmallDefaultNoActionsTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultLogoTopNoNavigationAppBar&quot;,
      value = getSmallDefaultNoNavigationTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallLogoTopAppBar&quot;,
      value = getSmallLogoTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallSygnetTopAppBar&quot;,
      value = getSmallSygnetTopAppBar(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallDefaultWithProgressTopAppBar&quot;,
      value = getSmallDefaultWithProgressTopAppBar(),
    ),
  )

  private fun getSmallDefaultNoTitleTopAppBar(): TopAppBarData = TopAppBarData.Small.Default(
    alignment = TitleAlignment.Center,
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.Icon(
      menuButtonData = MenuButtonData(
        icon = NOTIFICATION,
        iconColorProvider = { AppTheme.colors.neutral200 },
        onClick = {},
      ),
    ),
  )

  private fun getSmallDefaultNoActionsTopAppBar(): TopAppBarData = TopAppBarData.Small.Default(
    title = &quot;Small Title&quot;.toLabel(),
    alignment = TitleAlignment.Center,
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
  )

  private fun getSmallDefaultNoNavigationTopAppBar(): TopAppBarData = TopAppBarData.Small.Default(
    title = &quot;Small Title&quot;.toLabel(),
    alignment = TitleAlignment.Center,
    menuType = MenuType.Icon(
      menuButtonData = MenuButtonData(
        icon = NOTIFICATION,
        iconColorProvider = { AppTheme.colors.neutral200 },
        onClick = {},
      ),
    ),
  )

  private fun getSmallDefaultWithProgressTopAppBar(): TopAppBarData = TopAppBarData.Small.Default(
    title = &quot;Small Title&quot;.toLabel(),
    alignment = TitleAlignment.Center,
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.Icon(
      menuButtonData = MenuButtonData(
        icon = NOTIFICATION,
        onClick = {},
      ),
    ),
    progressBarData = ProgressBarData.IndicatorBar(
      value = 45,
      label = &quot;45%&quot;.toLabel(),
    ),
  )

  private fun getSmallSygnetTopAppBar(): TopAppBarData = TopAppBarData.Small.Sygnet(
    menuType = MenuType.Icon(
      menuButtonData = MenuButtonData(
        icon = NOTIFICATION,
        onClick = {},
      ),
    ),
  )

  private fun getSmallLogoTopAppBar(): TopAppBarData = TopAppBarData.Small.Logo()

  private fun getSmallDefaultTopAppBar(
    titleAlignment: TitleAlignment,
  ): TopAppBarData = TopAppBarData.Small.Default(
    title = &quot;Small Title&quot;.toLabel(),
    alignment = titleAlignment,
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.Icon(
      menuButtonData = MenuButtonData(
        icon = NOTIFICATION,
        onClick = {},
      ),
    ),
  )

  private fun getSmallDefaultIconListTopAppBar(
    titleAlignment: TitleAlignment,
  ): TopAppBarData = TopAppBarData.Small.Default(
    title = &quot;Small Title&quot;.toLabel(),
    alignment = titleAlignment,
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.IconList(
      listOf(
        MenuButtonData(
          icon = MenuButtonData.DefaultMenuIcon.CLOSE,
          iconColorProvider = { AppTheme.colors.neutral200 },
          onClick = {},
        ),
        MenuButtonData(
          icon = NOTIFICATION,
          iconColorProvider = { AppTheme.colors.neutral200 },
          onClick = {},
        ),
      ),
    ),

  )

  private fun getLargeTopAppBar() = TopAppBarData.Large(
    title = &quot;Large Large Large Large Large Large &quot;.toLabel(),
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.IconList(
      menuIconList = listOf(
        MenuButtonData(
          icon = MenuButtonData.DefaultMenuIcon.EDIT,
          onClick = {},
        ),
        MenuButtonData(
          icon = MenuButtonData.DefaultMenuIcon.CLOSE,
          onClick = {},
        ),
        MenuButtonData(
          icon = NOTIFICATION,
          onClick = {},
        ),
      ),
    ),
  )

  private fun getMediumTopAppBar() = TopAppBarData.Medium(
    title = &quot;Medium Medium Medium Medium Medium Medium&quot;.toLabel(),
    navigationButtonData = NavigationButtonData(
      icon = NavigationButtonData.Icon.BACK_ARROW,
      onClick = {},
    ),
    menuType = MenuType.IconList(
      menuIconList = listOf(
        MenuButtonData(
          icon = MenuButtonData.DefaultMenuIcon.QUESTION_MARK,
          onClick = {},
        ),
        MenuButtonData(
          icon = MenuButtonData.DefaultMenuIcon.EDIT,
          onClick = {},
        ),
        MenuButtonData(
          icon = NOTIFICATION,
          onClick = {},
        ),
      ),
    ),
  )

}
