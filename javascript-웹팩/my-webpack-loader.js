module.exports = function myWebPackLoader(content) {
    console.log('myWebpackLoader');
    return content.replace('console.log(', 'alert(');
}