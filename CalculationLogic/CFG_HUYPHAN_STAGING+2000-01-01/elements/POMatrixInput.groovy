def entry = api.createConfiguratorEntry()
def POData = out.POData as List<Object>
def FIELD_NAME_TO_LABEL_MAP = libs.HUYPHAN_General.Constants.FIELD_NAME_TO_LABEL_MAP
def resultMatrixUtils = libs.SharedLib.ResultMatrixUtils
def inputRowMatrix = resultMatrixUtils.resultMatrixFromList(
        POData as List<Map>,
        FIELD_NAME_TO_LABEL_MAP as Map
).toMatrix2D().collect()
List<String> columns = FIELD_NAME_TO_LABEL_MAP.values() as List<String>

def contextParameter = api.inputBuilderFactory()
        .createInputMatrix("poMatrix")
        .setNoCellRefresh(true)
        .setColumns(columns)
        .setCanModifyRows(false)
        .setReadOnlyColumns(columns)
        .setValue(inputRowMatrix)
        .setLabel("PO Small")
        .buildContextParameter()

def columnTypes = [
        "Text",
        "Text",
        "Text",
        "Text",
        "Text",
        "Money",
        "Numeric",
]
contextParameter?.addParameterConfigEntry("columnType", columnTypes)

entry.createParameter(contextParameter)

return entry
