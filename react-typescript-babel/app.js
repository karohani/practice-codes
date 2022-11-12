// const express = require("express");
// const app = express()
// const port = 4000
// const request = require('request')
// const config = require('config')
// const fs = require("fs");
// const iconv = require('iconv-lite');
// const jschardet = require('jschardet');
// const tempfile = require('tempfile');
//
// console.log(JSON.stringify(config))
// function iconvf(file){
//   const fileBuffer = fs.readFileSync(file);
//   const charset = jschardet.detect(fileBuffer);
//   console.log("charset", charset);
//   if(charset.encoding === null ) {
//     // for binary format
//     return fs.createReadStream(file);
//   } else if( charset.encoding !== "UTF-8" ) {
//     const temp = tempfile(".csv");
//     const output = iconv.decode(fileBuffer, charset.encoding);
//     fs.writeFileSync(temp, output, "utf-8");
//     return fs.createReadStream(temp);
//   }else{
//     return fs.createReadStream(file);
//   }
// }
//
// app.get('/', (req, res) => {
//   res.send('hello word')
// })
//
// app.post('/storage/v1/files', (req, res, next) => {
//   const url = `${config.wakanda.storage}`
//   const fileUploadRequest = request.post(url, { timeout: 600000 });
//   const form = fileUploadRequest.form();
//   form.append('file', iconvf(temp));
//   fileUploadRequest.pipe(res);
// })
//
// app.listen(port, () => {
//   console.log(`app run`)
// })