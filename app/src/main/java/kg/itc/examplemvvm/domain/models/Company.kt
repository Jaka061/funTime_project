package kg.itc.examplemvvm.domain.models

data class Company(
    var objectId: String,
    var name: String,
    var region: String,
    var type:String,
    var img: String,
    var description:String,
    var email : String,
    var instagram : String,
    var address : String,
    var number: String
)