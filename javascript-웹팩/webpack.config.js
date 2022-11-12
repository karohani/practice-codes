const path = require('path');
const MyWebpackPlugin = require('./my-webpack-plugin');
module.exports = {
    mode: "development",
    entry: {
        main: './app.js'
    },
    output: {
        path: path.resolve('./dist'),
        filename: '[name].js'
    },
    module: {
        rules: [
            {
                test: /\.js$/, // loader가 처리해야 할 파일의 패턴,
                use: [
                    path.resolve('./my-webpack-loader.js')
                ]
            },
            {
                test: /\.css$/, // loader가 처리해야 할 파일의 패턴,
                use: [
                    'style-loader',
                    'css-loader'
                ]
            },
            {
                test: /\.js$/,
                exclude: /node_modules/,
                loader: "babel-loader", // 바벨 로더를 추가한다
            }
        ]
    },
    plugins: [
        new MyWebpackPlugin()
    ]
}
