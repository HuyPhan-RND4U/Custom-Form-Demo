def inputMap = api.inputBuilderFactory().createConfiguratorInputBuilder(
        "pricingConfigurator",
        "CFG_HuyPhanCFO",
        true
)
        .buildMap()

customFormProcessor.addOrUpdateInput("ROOT", inputMap)