module.exports = {
  branches: ['main'],
  plugins: [
    '@semantic-release/commit-analyzer',
    '@semantic-release/release-notes-generator',
    '@semantic-release/changelog',
    '@semantic-release/npm',
    [
      '@semantic-release/npm',
      {
        npmToken: process.env.NPM_TOKEN,
      },
    ],
    '@semantic-release/github',
    [
      '@semantic-release/github',
      {
        
        repositoryUrl: 'https://github.com/CauaConceicao20/ProjetoA3-pipeline',
      },
    ],
    [
      '@semantic-release/git',
      {
        assets: ['CHANGELOG.md', 'package.json'],
      },
    ],
  ],
};
