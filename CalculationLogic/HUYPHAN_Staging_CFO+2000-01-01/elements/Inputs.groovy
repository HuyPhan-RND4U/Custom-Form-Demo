if (!customFormProcessor.isPrePhase()) {
    return
}

def inputMap = api.inputBuilderFactory().createConfiguratorInputBuilder(
        "pricingConfigurator",
        "CFG_HUYPHAN_STAGING",
        true
)
        .buildMap()

customFormProcessor.addOrUpdateInput("ROOT", inputMap)