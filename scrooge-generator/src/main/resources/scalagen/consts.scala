package {{package}}

@javax.annotation.Generated(value = Array("com.twitter.scrooge"), date = "{{date}}")
object Constants {
{{#constants}}
  {{docstring}}
  val {{name}}: {{fieldType}} = {{value}}
{{/constants}}
}
