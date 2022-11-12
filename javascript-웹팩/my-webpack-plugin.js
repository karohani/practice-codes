class MyWebpackPlugin {
    apply(compiler) {
        compiler.hooks.done.tap('My Plugin', stats => {
            console.log("MyPlugin : Done")
        })
    }
}
module.exports = MyWebpackPlugin;