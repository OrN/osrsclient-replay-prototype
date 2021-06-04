import java.util.HashMap;

// $FF: renamed from: mu
public class IDXMap {

   // $FF: renamed from: v jv
   class_306 field_4111;
   // $FF: renamed from: n jv
   class_306 field_4112;
   // $FF: renamed from: f java.util.HashMap
   HashMap map;
   // $FF: renamed from: d op
   static class_66 runescapeLogo;


   // $FF: renamed from: <init> (jv, jv) void
   public IDXMap(class_306 var1, class_306 var2) {
      super();
      try {
         this.field_4111 = var1;
         this.field_4112 = var2;
         this.map = new HashMap();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (mv[], int) java.util.HashMap
   public HashMap method_6611(FontHandler[] fonts, int var2) {
      try {
         HashMap ret = new HashMap();

         for(int i = 0; i < fonts.length; ++i) {
            if(var2 == -987560303) {
               throw new IllegalStateException();
            }

            FontHandler font = fonts[i];
            if(this.map.containsKey(font)) {
               if(var2 == -987560303) {
                  throw new IllegalStateException();
               }

               ret.put(font, this.map.get(font));
            } else {
               class_69 var7 = GameSocket.method_4140(this.field_4111, this.field_4112, font.name, "");
               if(null != var7) {
                  if(var2 == -987560303) {
                     throw new IllegalStateException();
                  }

                  this.map.put(font, var7);
                  ret.put(font, var7);
               }
            }
         }

         return ret;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: n (mv[]) java.util.HashMap
   public HashMap method_6612(FontHandler[] var1) {
      HashMap var2 = new HashMap();
      FontHandler[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         FontHandler var5 = var3[var4];
         if(this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            class_69 var6 = GameSocket.method_4140(this.field_4111, this.field_4112, var5.name, "");
            if(null != var6) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
