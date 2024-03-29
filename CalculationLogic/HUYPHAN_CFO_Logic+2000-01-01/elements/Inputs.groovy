if (!customFormProcessor.isPrePhase()) {
    return
}

def inputMap = api.inputBuilderFactory().createConfiguratorInputBuilder(
        "pricingConfigurator",
        "CFG_HuyPhanCFO",
        true
)
        .setValue([
                typedId: api.currentItem().typedId
        ])
        .buildMap()

customFormProcessor.addOrUpdateInput("ROOT", inputMap)