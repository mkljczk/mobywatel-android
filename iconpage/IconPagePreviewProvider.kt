package pl.gov.coi.common.ui.ds.iconpage

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowData
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowListData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class IconPagePreviewProvider : CustomPreviewParameterProvider&lt;IconPageData&lt;*, *&gt;&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;IconPageData&lt;*, *&gt;&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateFailure&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Failure,
        title = &quot;Icon Page Result Failure&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        descriptionSecond = &quot;description second&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateInfoNoBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Info,
        title = &quot;Icon Page Result Info&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateInfoBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Info,
        title = &quot;Icon Page Result Info&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = IconPageBottomContentData(
          primaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(label = &quot;Dalej&quot;.toLabel()),
            onClick = { },
          ),
          secondaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Secondary(),
            buttonType = ButtonType.WithText(label = &quot;Zamknij&quot;.toLabel()),
            onClick = { },
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateSuccessNoBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Success,
        title = &quot;Icon Page Result Success&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateSuccessBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Success,
        title = &quot;Icon Page Result Success&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = IconPageBottomContentData(
          primaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(label = &quot;Dalej&quot;.toLabel()),
            onClick = { },
          ),
          secondaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Secondary(),
            buttonType = ButtonType.WithText(label = &quot;Zamknij&quot;.toLabel()),
            onClick = { },
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageResultStateWarning&quot;,
      value = IconPageData(
        iconSection = IconSection.Result.Warning,
        title = &quot;Icon Page Result Success&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyStateDescription&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(),
        title = &quot;Icon Page Empty state&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyStateNoBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(),
        title = &quot;Icon Page Empty State&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyStateBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(),
        title = &quot;Icon Page Empty State&quot;.toLabel(),
        content = null,
        bottomContent = IconPageBottomContentData(
          primaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(label = &quot;Dalej&quot;.toLabel()),
            onClick = { },
          ),
          secondaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Secondary(),
            buttonType = ButtonType.WithText(label = &quot;Zamknij&quot;.toLabel()),
            onClick = { },
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyIconDescription&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(
          iconRes = R.drawable.g005_mbiznes,
        ),
        title = &quot;Icon Page Empty State&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        descriptionSecond = &quot;description second&quot;.toLabel(),
        content = null,
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyWithContentNoBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(
          iconRes = R.drawable.g005_mbiznes,
        ),
        title = &quot;Icon Page Empty State&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        descriptionSecond = &quot;description second&quot;.toLabel(),
        content = InfoRowListData(
          items = listOf(
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
          ),
        ),
        bottomContent = null,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;IconPageEmptyWithContentBottomButtons&quot;,
      value = IconPageData(
        iconSection = IconSection.Empty(
          iconRes = R.drawable.g005_mbiznes,
        ),
        title = &quot;Icon Page Empty State&quot;.toLabel(),
        descriptionFirst = &quot;description first&quot;.toLabel(),
        descriptionSecond = &quot;description second&quot;.toLabel(),
        content = InfoRowListData(
          items = listOf(
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
            InfoRowData.Bullet(
              description = &quot;Support text font: bodyLargeRegular color: neutral200&quot;.toLabel(),
            ),
          ),
        ),
        bottomContent = IconPageBottomContentData(
          primaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(label = &quot;Dalej&quot;.toLabel()),
            onClick = { },
          ),
          secondaryButtonData = ButtonData(
            buttonSize = ButtonSize.Large(),
            buttonVariant = ButtonVariant.Secondary(),
            buttonType = ButtonType.WithText(label = &quot;Zamknij&quot;.toLabel()),
            onClick = { },
          ),
        ),
      ),
    ),
  )
}
