def ce = api.createConfiguratorEntry()

def valueInput = api.inputBuilderFactory()
        .createTextUserEntry("tab1")
        .buildContextParameter()

ce.createParameter(valueInput)

return ce