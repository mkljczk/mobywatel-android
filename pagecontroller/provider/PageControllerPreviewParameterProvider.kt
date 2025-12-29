package pl.gov.coi.common.ui.ds.pagecontroller.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.pagecontroller.PageControllerData
import pl.gov.coi.common.ui.ds.smallcard.SmallCardData
import pl.gov.coi.common.ui.onboarding.model.OnboardingPageData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class PageControllerPreviewParameterProvider :
  CustomPreviewParameterProvider&lt;PageControllerData&lt;*&gt;&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;PageControllerData&lt;*&gt;&gt;&gt; =
    sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot;PageControllerSmallCardData&quot;,
        value = providePageControllerSmallCardData(),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;PageControllerOnboardingPageData&quot;,
        value = providePageControllerOnboardingPageData(),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;PageControllerSmallCardDataNoButton&quot;,
        value = providePageControllerSmallCardDataNoButton(),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;PageControllerOnboardingPageDataNoButton&quot;,
        value = providePageControllerOnboardingPageDataNoButton(),
      ),
    )

  private fun providePageControllerOnboardingPageDataNoButton() =
    PageControllerData(
      contentsData = listOf(
        PageControllerData.PageData(
          OnboardingPageData.Regular(
            title = &quot;Dokumenty zawsze pod ręką&quot;.toLabel(),
            message = &quot;Potwierdzaj tożsamość telefonem, na przykład w przychodni, pociągu, na poczcie.&quot;.toLabel() +
              &quot; Nie musisz pamiętać, aby nosić ze sobą dokumenty.&quot;.toLabel(),
            imageResId = R.drawable.coi_common_ui_ic_document_diia,
          ),
          isButtonVisible = false,
          buttonTitle = &quot;Dalej&quot;.toLabel(),
        ),
        PageControllerData.PageData(
          OnboardingPageData.Regular(
            title = &quot;Dokumenty zawsze pod ręką&quot;.toLabel(),
            message = &quot;Potwierdzaj tożsamość telefonem, na przykład w przychodni, pociągu, na poczcie.&quot;.toLabel() +
              &quot; Nie musisz pamiętać, aby nosić ze sobą dokumenty.&quot;.toLabel(),
            imageResId = R.drawable.coi_common_ui_ic_document_doctor,
          ),
          isButtonVisible = false,
          buttonTitle = &quot;Dalej&quot;.toLabel(),
        ),
      ),
    )

  private fun providePageControllerSmallCardDataNoButton() =
    PageControllerData(
      contentsData = listOf(
        PageControllerData.PageData(
          SmallCardData(
            title = &quot;Naruszenie środowiskowe&quot;.toLabel(),
            iconResId = R.drawable.da002_naruszenie_srodowiskowe,
            iconColorProvider = { AppTheme.colors.serviceLeafy100 },
            onClick = {},
          ),
          isButtonVisible = false,
          buttonTitle = &quot;Dalej&quot;.toLabel(),
        ),

        PageControllerData.PageData(
          SmallCardData(
            title = &quot;PWZ Pielęgniarka&quot;.toLabel(),
            iconResId = R.drawable.db017_pwz_pielegniarka,
            iconColorProvider = { AppTheme.colors.documentOcean400 },
            onClick = {},
          ),
          isButtonVisible = false,
          buttonTitle = &quot;Dalej&quot;.toLabel(),
        ),
      ),
    )

  private fun providePageControllerSmallCardData() = PageControllerData(
    contentsData = listOf(
      PageControllerData.PageData(
        SmallCardData(
          title = &quot;Naruszenie środowiskowe&quot;.toLabel(),
          iconResId = R.drawable.da002_naruszenie_srodowiskowe,
          iconColorProvider = { AppTheme.colors.serviceLeafy100 },
          onClick = {},
        ),
        isButtonVisible = true,
        buttonTitle = &quot;Rozpocznij&quot;.toLabel(),
      ),

      PageControllerData.PageData(
        SmallCardData(
          title = &quot;PWZ Pielęgniarka&quot;.toLabel(),
          iconResId = R.drawable.db017_pwz_pielegniarka,
          iconColorProvider = { AppTheme.colors.documentOcean400 },
          onClick = {},
        ),
        isButtonVisible = false,
        buttonTitle = &quot;Dalej&quot;.toLabel(),
      ),

      PageControllerData.PageData(
        SmallCardData(
          title = &quot;Legitymacja szkolna&quot;.toLabel(),
          iconResId = R.drawable.db008_legitymacja_szkolna,
          iconColorProvider = { AppTheme.colors.documentPink200 },
          onClick = {},
        ),
        isButtonVisible = true,
        buttonTitle = &quot;Zakończ&quot;.toLabel(),
      ),
    ),
  )

  private fun providePageControllerOnboardingPageData() = PageControllerData(
    contentsData = listOf(
      PageControllerData.PageData(
        OnboardingPageData.Regular(
          title = &quot;Dokumenty zawsze pod ręką&quot;.toLabel(),
          message = &quot;Potwierdzaj tożsamość telefonem, na przykład w przychodni, pociągu, na poczcie.&quot;.toLabel() +
            &quot; Nie musisz pamiętać, aby nosić ze sobą dokumenty.&quot;.toLabel(),
          imageResId = R.drawable.coi_common_ui_ic_document_diia,
        ),
        isButtonVisible = true,
        buttonTitle = &quot;Rozpocznij&quot;.toLabel(),
      ),
      PageControllerData.PageData(
        OnboardingPageData.Regular(
          title = &quot;Dokumenty zawsze pod ręką&quot;.toLabel(),
          message = &quot;Potwierdzaj tożsamość telefonem, na przykład w przychodni, pociągu, na poczcie.&quot;.toLabel() +
            &quot; Nie musisz pamiętać, aby nosić ze sobą dokumenty.&quot;.toLabel(),
          imageResId = R.drawable.coi_common_ui_ic_document_doctor,
        ),
        isButtonVisible = false,
        buttonTitle = &quot;Dalej&quot;.toLabel(),
      ),
      PageControllerData.PageData(
        OnboardingPageData.Regular(
          title = &quot;Dokumenty zawsze pod ręką&quot;.toLabel(),
          message = &quot;Potwierdzaj tożsamość telefonem, na przykład w przychodni, pociągu, na poczcie.&quot;.toLabel() +
            &quot; Nie musisz pamiętać, aby nosić ze sobą dokumenty.&quot;.toLabel(),
          imageResId = R.drawable.coi_common_ui_ic_document_id,
        ),
        isButtonVisible = true,
        buttonTitle = &quot;Zakończ&quot;.toLabel(),
      ),
    ),
  )
}
