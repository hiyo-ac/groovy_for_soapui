// ファイル読み込み
def file = new File("D:\\workspace\\groovy_for_soapui\\groovy_for_soapui\\file_read\\sampleCSV.csv")

// eachLineで各行を表示してみる
file.eachLine { println(it)}

// listに各行の要素をばらして格納しつつ
def list = []
file.splitEachLine(","){ data ->
    println "データ:"+ data
    list.add(data)
}

// listをそのまま表示
println "-----"
println list

// listの中から特定の要素にアクセス
println "-----"
println list[1][1]