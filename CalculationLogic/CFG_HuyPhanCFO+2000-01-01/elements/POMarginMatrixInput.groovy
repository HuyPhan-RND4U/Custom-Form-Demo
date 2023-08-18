def ce = api.createConfiguratorEntry()
Object constants = libs.HUYPHAN_General.Constants
def LABEL_TO_FIELD_NAME_MAP = constants.LABEL_TO_FIELD_NAME_MAP
List<String> columns = LABEL_TO_FIELD_NAME_MAP.values() as List<String>

def contextParameter = api.inputBuilderFactory()
        .createInputMatrix("poMatrix")
        .setNoCellRefresh(true)
        .setColumns(columns)
        .setCanModifyRows(false)
        .setReadOnlyColumns(columns.findAll { it != "standardDiscount" })
        .setLabel("PO Margin Matrix")
        .buildContextParameter()

ce.createParameter(contextParameter)
ce.getFirstInput().setValue(out.IsChanged ? out.POMargin.collect {
    it.selected = false
    return it
} : api.input("poMatrix"))

return ce