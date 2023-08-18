def ce = api.createConfiguratorEntry()

def valueInput = api.inputBuilderFactory()
        .createHiddenEntry("typedId")
        .buildContextParameter()

ce.createParameter(valueInput)

return ce