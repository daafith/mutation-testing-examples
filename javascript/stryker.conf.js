module.exports = function(config) {
  config.set({
    testRunner: "mocha",
    mutator: "javascript",
    transpilers: [],
    reporters: ['progress', 'clear-text', 'dots', 'html'],
    packageManager: "npm",
    testFramework: "mocha",
    coverageAnalysis: "perTest",
    mutate: ["app/**/*.js"]
  });
};
