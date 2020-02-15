# tokTales Engine - Templates

> Contains project templates for getting started with **[tokTales Engine](https://github.com/Tokelon/tokTales)**.

## Projects

| Project Name | Description | Build |
| ------------ | ----------- | ----- |
| tokTales-template-default | The default template that supports all platforms. | ![tokTales-template-default CI](https://github.com/Tokelon/tokTales-templates/workflows/tokTales-template-default%20CI/badge.svg) |
| tokTales-template-desktop | A template with support for the Desktop platform. | ![tokTales-template-desktop CI](https://github.com/Tokelon/tokTales-templates/workflows/tokTales-template-desktop%20CI/badge.svg) |
| tokTales-template-android | A template with support for the Android platform. | ![tokTales-template-android CI](https://github.com/Tokelon/tokTales-templates/workflows/tokTales-template-android%20CI/badge.svg) |

## Setup

Download a template project, replace all placeholder values with your own and start developing.

### Step by step

1. Clone or download this repository
2. Copy template project folder to target location
3. Rename template project folder to target project name
4. Rename Java packages to target project package names
5. Android: Set `package` value in **AndroidManifest.xml** to target application package
6. Android: Set `applicationId` in Android **build.gradle** to target application id

### Optional

- Android: Set app display name  
Replace the value of the `app_name` resource entry in **res/values/strings.xml**.
- Set root project name explicitly  
Add line `rootProject.name='<projectname>'` to **settings.gradle**.
- Prefix subproject names with target project name (e.g. `desktop` becomes `<projectname>-desktop`)  
Rename subproject folders and replace names in **settings.gradle** and **build.gradle** files.
