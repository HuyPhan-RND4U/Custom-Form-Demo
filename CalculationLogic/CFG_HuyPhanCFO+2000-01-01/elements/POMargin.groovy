String typedId = api.input("typedId")
Object stagingCFO = api.find(
        'CFO',
        0,
        1,
        null,
        [
                "outputsJson"
        ],
        Filter.equal("uniqueName", "staging"),
        Filter.equal("parentTypedId", typedId),
).collect {
        it.selectedPOMargin = api.jsonDecode(it.outputsJson)?.rows?.result?.entries ?: []

        return it
}
.find()

return stagingCFO.selectedPOMargin