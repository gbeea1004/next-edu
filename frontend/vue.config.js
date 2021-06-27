module.exports = {
  lintOnSave: false,
  devServer: {
    host: 'local-nextedu.com',
    port: 8081,
    proxy: {
      '/api': {
        target: 'http://local-nextedu.com:8080',
        changeOrigin: true,
        logLevel: 'debug'
      }
    }
  },
  chainWebpack: config => {
    config.plugins.delete('prefetch');
  }
};
