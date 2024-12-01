package top.drewssite.infiniteemojis.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * Creative mode tabs for the mod.
 */
public class ModCreativeModeTabs {

  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
      DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfiniteEmojis.MOD_ID);

  public static final RegistryObject<CreativeModeTab> INFINITE_EMOJIS_TAB =
      CREATIVE_MODE_TABS.register("infinite_emojis_tab", () -> CreativeModeTab.builder()
          .icon(() -> new ItemStack(ModItems.FACE.get()))
          .title(Component.translatable("creativetab.infinite_emojis_tab"))
          .displayItems((parameters, output) -> {
            // Face
            output.accept(ModItems.FACE.get());
            // Eyes
            output.accept(EyeItems.EYES.get());
            output.accept(EyeItems.BIG_EYES.get());
            output.accept(EyeItems.SMILING_EYES.get());
            output.accept(EyeItems.SQUINTING_EYES.get());
            output.accept(EyeItems.WINKING_EYES.get());
            output.accept(EyeItems.HEART_EYES.get());
            output.accept(EyeItems.STAR_EYES.get());
            output.accept(EyeItems.CLOSED_EYES.get());
            output.accept(EyeItems.SMIRKING_EYES.get());
            output.accept(EyeItems.ZANY_EYES.get());
            output.accept(EyeItems.DOLLAR_EYES.get());
            output.accept(EyeItems.BIG_EYEBROWS_UP_EYES.get());
            output.accept(EyeItems.GLARING_EYES.get());
            output.accept(EyeItems.THINKING_EYES.get());
            // Mouths
            output.accept(ModItems.SMILE.get());
            output.accept(ModItems.BEAMING_SMILE.get());
            output.accept(ModItems.SLIGHT_SMILE.get());
            output.accept(ModItems.SMALL_SMILE.get());
            output.accept(ModItems.KISSING_MOUTH.get());
            output.accept(ModItems.SMIRKING_MOUTH.get());
            output.accept(ModItems.YUM_MOUTH.get());
            output.accept(ModItems.TONGUE_MOUTH.get());
            output.accept(ModItems.MONEY_MOUTH.get());
            output.accept(ModItems.SURPRISED_MOUTH.get());
            output.accept(ModItems.THINKING_MOUTH.get());
            output.accept(ModItems.DROOLING_MOUTH.get());
            output.accept(ModItems.PARTY_MOUTH.get());
            output.accept(ModItems.BUCK_TOOTHED_MOUTH.get());
            //Emojis
            output.accept(EmojiItems.GRINNING_FACE.get());
            // Metal detector
            output.accept(ModItems.METAL_DETECTOR.get());
          })
          .build());

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event event bus to register to
   */
  public static void register(IEventBus event) {

    CREATIVE_MODE_TABS.register(event);

  }

}
