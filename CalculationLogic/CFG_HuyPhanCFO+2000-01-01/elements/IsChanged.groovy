Object constants = libs.HUYPHAN_General.Constants
def LABEL_TO_FIELD_NAME_MAP = constants.LABEL_TO_FIELD_NAME_MAP
List<String> columns = LABEL_TO_FIELD_NAME_MAP.values() as List<String>
List<Object> poMatrix = api.input("poMatrix")
List<Object> poMatrixFromPreviousCFO = out.POMargin

if (poMatrix?.size() != poMatrixFromPreviousCFO.size()) {
    return true
}

for (int i = 0; i < poMatrix.size(); i++) {
    if (!columns.findAll {
        it != 'standardDiscount'
    }.every {poMatrix[i][it] == poMatrixFromPreviousCFO[i][it]}) {
        return true
    }
}

return false