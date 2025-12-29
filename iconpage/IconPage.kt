package pl.gov.coi.common.ui.ds.iconpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.Button
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIconData
import pl.gov.coi.common.ui.ds.custom.icon.Icon
import pl.gov.coi.common.ui.ds.inforow.InfoRowList
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowListData
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.theme.AppTheme
import pl.gov.coi.common.ui.topMenu.TopMenu

@Composable
fun &lt;CONTENT_DATA, BOTTOM_CONTENT&gt; IconPage(
  data: IconPageData&lt;CONTENT_DATA, BOTTOM_CONTENT&gt;,
  content: @Composable (CONTENT_DATA) -&gt; Unit = {},
  bottomContent: @Composable (BOTTOM_CONTENT) -&gt; Unit = {},
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(AppTheme.colors.background)
      .padding(horizontal = AppTheme.dimensions.spacing200)
      .then(
        other = if (data.bottomContent != null) {
          Modifier.padding(vertical = AppTheme.dimensions.spacing200)
        } else {
          Modifier
        },
      ),
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(state = rememberScrollState())
        .weight(weight = 1F),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      if (data.content != null) Spacer(Modifier.height(height = AppTheme.dimensions.spacing100))
      Icon(
        data = data.iconSection.icon,
      )
      Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing200))
      CustomText(
        label = data.title,
        style = AppTheme.typography.headlineMedium,
        textAlign = TextAlign.Center,
        color = AppTheme.colors.neutral500,
      )

      data.descriptionFirst?.let { descriptionFirst -&gt;
        Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing200))
        CustomText(
          label = descriptionFirst,
          style = AppTheme.typography.bodyLargeRegular,
          textAlign = TextAlign.Center,
          color = AppTheme.colors.neutral200,
        )
      }

      data.descriptionSecond?.let { descriptionSecond -&gt;
        Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing200))
        CustomText(
          label = descriptionSecond,
          style = AppTheme.typography.bodyLargeRegular,
          textAlign = TextAlign.Center,
          color = AppTheme.colors.neutral200,
        )
      }

      data.content?.let { content -&gt;
        Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing200))
        content(content)
      }
    }

    data.bottomContent?.let { bottomContent -&gt;
      Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing200))
      bottomContent(bottomContent)
    }
  }
}

@Preview
@Composable
fun IconPagePreview(
  @PreviewParameter(
    IconPagePreviewProvider::class,
  ) data: IconPageData&lt;*, *&gt;,
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(color = AppTheme.colors.background),
  ) {
    TopMenu(
      label = &quot;IconPage 1.1.0&quot;.toLabel(tag = &quot;topMenuLabel&quot;),
      mainButtonData = ButtonIconData(

        iconResId = R.drawable.ab004_arrow_left,
        iconColorProvider = { AppTheme.colors.neutral200 },
        onClick = { },
      ),
    )
    IconPage(
      data = data,
      content = { contentData -&gt;
        if (contentData is InfoRowListData) InfoRowList(data = contentData)
      },
      bottomContent = { bottomContentData -&gt;
        if (bottomContentData is IconPageBottomContentData) {
          Button(data = bottomContentData.primaryButtonData)
          bottomContentData.secondaryButtonData?.let { secondaryButtonData -&gt;
            Spacer(modifier = Modifier.height(height = AppTheme.dimensions.spacing150))
            Button(data = secondaryButtonData)
          }
        }
      },
    )
  }
}
