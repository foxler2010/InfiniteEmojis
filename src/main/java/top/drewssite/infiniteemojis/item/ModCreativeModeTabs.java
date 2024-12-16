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

  @SuppressWarnings("unused")
  public static final RegistryObject<CreativeModeTab> INFINITE_EMOJIS_TAB =
      CREATIVE_MODE_TABS.register("infinite_emojis_tab", () -> CreativeModeTab.builder()
          .icon(() -> new ItemStack(EmojiItems.GRINNING_FACE.get()))
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
            output.accept(MouthItems.SMILE.get());
            output.accept(MouthItems.BEAMING_SMILE.get());
            output.accept(MouthItems.SLIGHT_SMILE.get());
            output.accept(MouthItems.SMALL_SMILE.get());
            output.accept(MouthItems.KISSING_MOUTH.get());
            output.accept(MouthItems.SMIRKING_MOUTH.get());
            output.accept(MouthItems.YUM_MOUTH.get());
            output.accept(MouthItems.TONGUE_MOUTH.get());
            output.accept(MouthItems.MONEY_MOUTH.get());
            output.accept(MouthItems.SURPRISED_MOUTH.get());
            output.accept(MouthItems.THINKING_MOUTH.get());
            output.accept(MouthItems.DROOLING_MOUTH.get());
            output.accept(MouthItems.PARTY_MOUTH.get());
            output.accept(MouthItems.BUCK_TOOTHED_MOUTH.get());
            //Emojis
            output.accept(EmojiItems.GRINNING_FACE.get());
            output.accept(EmojiItems.GRINNING_FACE_WITH_BIG_EYES.get());
            output.accept(EmojiItems.GRINNING_FACE_WITH_SMILING_EYES.get());
            output.accept(EmojiItems.BEAMING_FACE.get());
            output.accept(EmojiItems.GRINNING_SQUINTING_FACE.get());
            output.accept(EmojiItems.SLIGHTLY_SMILING_FACE.get());
            output.accept(EmojiItems.WINKING_FACE.get());
            output.accept(EmojiItems.SMILING_FACE_WITH_SMILING_EYES.get());
            output.accept(EmojiItems.HEART_EYED_FACE.get());
            output.accept(EmojiItems.STAR_STRUCK_FACE.get());
            output.accept(EmojiItems.FACE_BLOWING_A_KISS.get());
            output.accept(EmojiItems.KISSING_FACE.get());
            output.accept(EmojiItems.SMILING_FACE_WITH_CLOSED_EYES.get());
            output.accept(EmojiItems.KISSING_FACE_WITH_CLOSED_EYES.get());
            output.accept(EmojiItems.KISSING_FACE_WITH_SMILING_EYES.get());
            output.accept(EmojiItems.SMIRKING_FACE.get());
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
