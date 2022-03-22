/**
 * A class to force alignment of versions in cases where there is no BOM to
 * sync around. This way if you are using, e.g., a particular version of slf4j
 * or a version of checkerframework and update the dependency it will update
 * even for transient dependencies you aren't using.
 */

abstract class ForceAlignmentRule : ComponentMetadataRule {
    override fun execute(ctx: ComponentMetadataContext) {
        ctx.details.run {
            if (id.group.equals("org.checkerframework")) {
                belongsTo("org.checkerframework:checker-virtual-platform:${id.version}")
            } else if (id.group.equals("org.slf4j")) {
                belongsTo("org.slf4j:slf4j-virtual-platform:${id.version}")
            }
        }
    }
}

dependencies {
    components.all<ForceAlignmentRule>()
}
