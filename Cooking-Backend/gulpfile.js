const gulp = require('gulp'),
    ts = require('gulp-typescript'),
    clean = require('gulp-clean');
const babel = require('gulp-babel');
const findBabelConfig = require('find-babel-config');
const { file, config } = findBabelConfig.sync('src');
// if c === null, the config wasn't found
if (file) {
    // file is the file in which the config is found
    console.log(file);
    // config is a JS plain object with the babel config
    console.log(config);
}

const BUILD_DIRECTORY = 'dist',
    tsProject = ts.createProject('tsconfig.json');

gulp.task('watch', ['scripts'], () => {
    gulp.watch('src/**/*.ts', ['scripts']);
});

gulp.task('clean-scripts', function () {
    return gulp.src(BUILD_DIRECTORY, { read: false })
        .pipe(clean());
});

gulp.task('scripts', function () {
    const tsResult = tsProject.src()
        .pipe(tsProject());
    return tsResult.js
        .pipe(babel(config))
        .pipe(gulp.dest(BUILD_DIRECTORY));
});

gulp.task('build', ['scripts']);
