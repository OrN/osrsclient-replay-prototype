import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

// $FF: renamed from: cl
public class Preferences {

   // $FF: renamed from: u int
   int field_2115;
   // $FF: renamed from: n int
   static final int field_2116 = 10;
   // $FF: renamed from: f boolean
   boolean roofsHidden;
   // $FF: renamed from: y boolean
   boolean musicEnabled;
   // $FF: renamed from: p int
   int clientSizeMode;
   // $FF: renamed from: j java.lang.String
   String rememberedEmail;
   // $FF: renamed from: s int
   int field_2121;
   // $FF: renamed from: d int
   int field_2122;
   // $FF: renamed from: r boolean
   boolean field_2123;
   // $FF: renamed from: v int
   static int field_2124;
   // $FF: renamed from: eg java.security.SecureRandom
   static SecureRandom secureRandom;
   // $FF: renamed from: l java.util.LinkedHashMap
   LinkedHashMap field_2126;
   // $FF: renamed from: qd int
   static final int field_2127 = 2;
   // $FF: renamed from: b double
   double field_2128;


   // $FF: renamed from: n (int) nd
   Buffer toBuffer(int var1) {
      try {
         Buffer var10000 = new Buffer(100);
         Buffer var2 = var10000;
         var2.writeByte(-437407307 * field_2124);
         var2.writeByte(this.roofsHidden ?1:0);
         var2.writeByte(this.musicEnabled ?1:0);
         var2.writeByte(this.clientSizeMode * -660685365);
         var2.writeByte(this.field_2126.size());
         Iterator var3 = this.field_2126.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var2.writeIntReverse(((Integer)var4.getKey()).intValue());
            var2.writeIntReverse(((Integer)var4.getValue()).intValue());
         }

         String var10001;
         if(this.rememberedEmail != null) {
            if(var1 <= -1538307343) {
               throw new IllegalStateException();
            }

            var10001 = this.rememberedEmail;
         } else {
            var10001 = "";
         }

         var2.writeString(var10001);
         var2.method_250(this.field_2123, (short)-16479);
         var2.writeByte((int)(100.0D * this.field_2128));
         var2.writeByte(this.field_2122 * 1285356667);
         var2.writeByte(-140834991 * this.field_2121);
         var2.writeByte(-1768933319 * this.field_2115);
         return var2;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <init> (nd) void
   Preferences(Buffer var1) {
      try {
         this.clientSizeMode = 511868899;
         this.rememberedEmail = null;
         this.field_2123 = false;
         this.field_2128 = 0.8D;
         this.field_2122 = -264120627;
         this.field_2121 = -1577437489;
         this.field_2115 = 1937297015;
         this.field_2126 = new LinkedHashMap();
         if(var1 != null && null != var1.data) {
            int var2 = var1.readUnsignedByte();
            if(var2 >= 0 && var2 <= field_2124 * -437407307) {
               if(var1.readUnsignedByte() == 1) {
                  this.roofsHidden = true;
               }

               if(var2 > 1) {
                  this.musicEnabled = var1.readUnsignedByte() == 1;
               }

               if(var2 > 3) {
                  this.clientSizeMode = var1.readUnsignedByte() * 511868899;
               }

               if(var2 > 2) {
                  int var3 = var1.readUnsignedByte();

                  for(int var4 = 0; var4 < var3; ++var4) {
                     int var5 = var1.readInt();
                     int var6 = var1.readInt();
                     this.field_2126.put(Integer.valueOf(var5), Integer.valueOf(var6));
                  }
               }

               if(var2 > 4) {
                  this.rememberedEmail = var1.method_347(-189323230);
               }

               if(var2 > 5) {
                  this.field_2123 = var1.method_119(788058203);
               }

               if(var2 > 6) {
                  this.field_2128 = (double)var1.readUnsignedByte() / 100.0D;
                  this.field_2122 = var1.readUnsignedByte() * -813727053;
                  this.field_2121 = var1.readUnsignedByte() * 156672433;
                  this.field_2115 = var1.readUnsignedByte() * 1570911753;
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2124 = 213856331;
   }

   // $FF: renamed from: <init> () void
   Preferences() {
      this(null);
   }
}
