import net.pricefx.common.api.InputType

Object LABEL_TO_FIELD_NAME_MAP = libs.HUYPHAN_General.Constants.LABEL_TO_FIELD_NAME_MAP
def entry = api.createConfiguratorEntry(InputType.HIDDEN, "selectedRows")
List<Object> rowsFromInput = out.POMatrixInput.getFirstInput().getValue() as List<Object>

List<Object> selectedRows = rowsFromInput.findAll {
    it.selected
}.collect { row ->
    Object rowWithFieldName = [:]

    row.keySet().findAll {
        LABEL_TO_FIELD_NAME_MAP[it as String] != null
    }.each { label ->
        rowWithFieldName << [(LABEL_TO_FIELD_NAME_MAP[label]): row[label]]
    }

    rowWithFieldName << [selected: true]

    return rowWithFieldName
}

entry.getFirstInput().setValue(selectedRows)

return entry


