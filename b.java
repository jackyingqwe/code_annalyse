package com.ghosun.dict.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.ghosun.dict.MyApplication;
import com.ghosun.dict.f.n;
import com.ghosun.dict.f.o;
import com.ghosun.dict.f.p;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class b
{
  public static int f;
  public static List q;
  public static List r;
  public boolean a;
  public boolean b;
  public int c;
  int d;
  int e;
  List g = null;
  int[] h;
  public int i;
  int j;
  List k = null;
  int[] l = null;
  int[] m = null;
  int n;
  List o;
  List p;

  private void i()
  {
    int i5 = 4;
    int i3 = 0;
    try
    {
      Object localObject1 = MyApplication.class.getResourceAsStream("/assets/e");
      byte[] arrayOfByte = new byte[((InputStream)localObject1).available()];
      Object localObject2 = new byte[8192];
      int i1 = 0;
      int i2 = ((InputStream)localObject1).read((byte[])localObject2);
      if (i2 <= 0)
      {
        ((InputStream)localObject1).close();
        localObject1 = new byte[4];
        System.arraycopy(arrayOfByte, 0, localObject1, 0, 4);
        this.n = c.b((byte[])localObject1);
        this.p = new ArrayList(this.n);
        localObject1 = new byte[4];
        i1 = 0;
      }
      int i4;
      for (i2 = 0; ; i2 = i4)
      {
        if (i1 >= this.n)
        {
          this.l[i2] = this.n;
          return;
          System.arraycopy(localObject2, 0, arrayOfByte, i1, i2);
          i1 += i2;
          break;
        }
        localObject2 = new n();
        System.arraycopy(arrayOfByte, i5, localObject1, 0, 4);
        int i7 = c.b((byte[])localObject1);
        i4 = i5 + 4;
        localObject1[0] = 0;
        System.arraycopy(arrayOfByte, i4, localObject1, 1, 3);
        int i6 = c.b((byte[])localObject1) - 71;
        int i8 = i4 + 3;
        byte b1 = arrayOfByte[i8];
        i5 = i3;
        i4 = i2;
        if (i3 != i6)
        {
          this.l[i2] = i1;
          i4 = i2 + 1;
          i5 = i6;
        }
        ((n)localObject2).setEtymaId(i7 - 71);
        ((n)localObject2).setWordId(i6);
        ((n)localObject2).subPos = b1;
        this.p.add(localObject2);
        i1 += 1;
        i2 = i8 + 1;
        i3 = i5;
        i5 = i2;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  private void j()
  {
    int i3 = 0;
    try
    {
      Object localObject1 = MyApplication.class.getResourceAsStream("/assets/f");
      byte[] arrayOfByte = new byte[((InputStream)localObject1).available()];
      Object localObject2 = new byte[8192];
      int i1 = 0;
      int i2 = ((InputStream)localObject1).read((byte[])localObject2);
      if (i2 <= 0)
      {
        ((InputStream)localObject1).close();
        localObject1 = new byte[4];
        System.arraycopy(arrayOfByte, 0, localObject1, 0, 4);
        this.n = c.b((byte[])localObject1);
        this.o = new ArrayList(this.n);
        localObject1 = new byte[4];
        i1 = 0;
        i2 = 0;
      }
      int i7;
      for (int i4 = 4; ; i4 = i7)
      {
        if (i1 >= this.n)
        {
          this.m[i2] = this.n;
          return;
          System.arraycopy(localObject2, 0, arrayOfByte, i1, i2);
          i1 += i2;
          break;
        }
        localObject2 = new n();
        System.arraycopy(arrayOfByte, i4, localObject1, 0, 2);
        int i6 = (short)((short)c.a((byte[])localObject1) - 71);
        i4 += 2;
        localObject1[0] = 0;
        System.arraycopy(arrayOfByte, i4, localObject1, 1, 3);
        int i8 = c.b((byte[])localObject1);
        i7 = i4 + 3 + 2;
        int i5 = i3;
        i4 = i2;
        if (i3 != i6)
        {
          this.m[i2] = i1;
          i4 = (short)(i2 + 1);
          i5 = i6;
        }
        ((n)localObject2).setEtymaId(i6);
        ((n)localObject2).setWordId(i8 - 71);
        this.o.add(localObject2);
        i1 += 1;
        i3 = i5;
        i2 = i4;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  private void k()
  {
    this.d = 0;
    this.e = 0;
    try
    {
      Object localObject1 = MyApplication.class.getResourceAsStream("/assets/c");
      byte[] arrayOfByte1 = new byte[((InputStream)localObject1).available()];
      Object localObject2 = new byte[8192];
      int i1 = 0;
      int i2;
      while (true)
      {
        i2 = ((InputStream)localObject1).read((byte[])localObject2);
        if (i2 <= 0)
        {
          ((InputStream)localObject1).close();
          localObject1 = new byte[4];
          System.arraycopy(arrayOfByte1, 0, localObject1, 0, 4);
          f = c.b((byte[])localObject1);
          this.g = new ArrayList(f);
          this.m = new int[f + 1];
          localObject1 = new byte[2];
          i2 = 4;
          i1 = 0;
          if (i1 < f)
            break;
          return;
        }
        System.arraycopy(localObject2, 0, arrayOfByte1, i1, i2);
        i1 += i2;
      }
      localObject2 = new o();
      System.arraycopy(arrayOfByte1, i2, localObject1, 0, 2);
      int i3 = c.a((byte[])localObject1);
      ((o)localObject2).setEtymaId((short)(i1 + 1));
      i3 = (i3 & 0xC000) >> 14;
      ((o)localObject2).setType((byte)i3);
      i2 += 2;
      if (i3 == 2)
        this.d += 1;
      while (true)
      {
        i3 = arrayOfByte1[i2];
        i2 += 1;
        byte[] arrayOfByte2 = new byte[i3];
        System.arraycopy(arrayOfByte1, i2, arrayOfByte2, 0, i3);
        ((o)localObject2).setWord(arrayOfByte2);
        i3 = i2 + i3;
        System.arraycopy(arrayOfByte1, i3, localObject1, 0, 2);
        i2 = c.a((byte[])localObject1);
        i3 += 2;
        arrayOfByte2 = new byte[i2];
        System.arraycopy(arrayOfByte1, i3, arrayOfByte2, 0, i2);
        ((o)localObject2).setMeaning(arrayOfByte2);
        i2 = i3 + i2;
        int i4 = arrayOfByte1[i2];
        i3 = i2 + 1;
        i2 = i3;
        if (i4 > 0)
          i2 = i3 + i4 * 2;
        this.g.add(localObject2);
        i1 += 1;
        i2 += 2;
        break;
        this.e += 1;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public int a(String paramString)
  {
    Object localObject = null;
    try
    {
      paramString = paramString.getBytes("utf-8");
      return a(paramString, 0, this.j - 1);
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        paramString.printStackTrace();
        paramString = localObject;
      }
    }
  }

  int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 - paramInt1 == 1)
    {
      if (h.a(paramArrayOfByte, ((p)this.k.get(paramInt1)).getWord()) == 0)
        return paramInt1;
      if (h.a(paramArrayOfByte, ((p)this.k.get(paramInt2)).getWord()) == 0)
        return paramInt2;
      return -1;
    }
    int i1 = (paramInt2 - paramInt1) / 2 + paramInt1;
    int i2 = h.a(paramArrayOfByte, ((p)this.k.get(i1)).getWord());
    if (i2 == 0)
      return i1;
    if (i2 > 0)
      paramInt1 = i1;
    while (true)
    {
      return a(paramArrayOfByte, paramInt1, paramInt2);
      paramInt2 = i1;
    }
  }

  public void a()
  {
    k();
    c();
    j();
    i();
    b();
  }

  public void a(int paramInt)
  {
    q.clear();
    int i1 = this.l[paramInt];
    int i2 = this.l[(paramInt + 1)];
    paramInt = i1;
    if (paramInt >= i2)
      return;
    i1 = ((n)this.p.get(paramInt)).getEtymaId();
    int i3 = ((n)this.p.get(paramInt)).subPos;
    o localo;
    if (i1 < 10000)
    {
      localo = (o)this.g.get(i1 - 1);
      localo.setSubpos((byte)(i3 + 10));
      q.add(localo);
    }
    while (true)
    {
      paramInt += 1;
      break;
      localo = new o();
      localo.setEtymaId(i1);
      q.add(localo);
    }
  }

  public void a(SharedPreferences paramSharedPreferences)
  {
    q = new ArrayList();
    r = new ArrayList();
    this.c = paramSharedPreferences.getInt("etyma_book_mark", 0);
    this.b = paramSharedPreferences.getBoolean("etyma_show_meaning", false);
    this.a = paramSharedPreferences.getBoolean("showPrefix", false);
  }

  public int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 - paramInt1 == 1)
    {
      if (h.a(paramArrayOfByte, ((o)this.g.get(this.h[paramInt1])).getWord()) <= 0)
        return paramInt1;
      return paramInt2;
    }
    int i1 = (paramInt2 - paramInt1) / 2 + paramInt1;
    int i2 = h.a(paramArrayOfByte, ((o)this.g.get(this.h[i1])).getWord());
    if (i2 == 0)
      return i1;
    if (i2 > 0)
      paramInt1 = i1;
    while (true)
    {
      return b(paramArrayOfByte, paramInt1, paramInt2);
      paramInt2 = i1;
    }
  }

  public void b()
  {
    int i2 = 0;
    int i3 = this.d;
    int i1 = i3;
    if (this.a)
      i1 = i3 + this.e;
    this.h = new int[i1];
    this.i = i1;
    i3 = 0;
    if (i2 >= f)
      return;
    if (((o)this.g.get(i2)).getType() == 2)
    {
      this.h[i3] = i2;
      i1 = i3 + 1;
    }
    while (true)
    {
      i2 += 1;
      i3 = i1;
      break;
      i1 = i3;
      if (this.a)
      {
        this.h[i3] = i2;
        i1 = i3 + 1;
      }
    }
  }

  public void b(int paramInt)
  {
    r.clear();
    int i1 = this.m[(paramInt - 1)];
    int i2 = this.m[paramInt];
    paramInt = i1;
    while (true)
    {
      if (paramInt >= i2)
        return;
      i1 = ((n)this.o.get(paramInt)).getWordId();
      p localp = (p)this.k.get(i1 - 1);
      r.add(localp);
      paramInt += 1;
    }
  }

  public o c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.i))
      return null;
    return (o)this.g.get(this.h[paramInt]);
  }

  public void c()
  {
    try
    {
      Object localObject = MyApplication.class.getResourceAsStream("/assets/d");
      byte[] arrayOfByte1 = new byte[((InputStream)localObject).available()];
      byte[] arrayOfByte2 = new byte[8192];
      int i1 = 0;
      int i2 = ((InputStream)localObject).read(arrayOfByte2);
      if (i2 <= 0)
      {
        ((InputStream)localObject).close();
        localObject = new byte[4];
        System.arraycopy(arrayOfByte1, 0, localObject, 0, 4);
        this.j = c.b((byte[])localObject);
        this.k = new ArrayList(this.j);
        this.l = new int[this.j + 1];
        i2 = 4;
        i1 = 0;
      }
      while (true)
      {
        if (i1 >= this.j)
        {
          return;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i1, i2);
          i1 += i2;
          break;
        }
        localObject = new p();
        ((p)localObject).setWordId(i1 + 1);
        int i3 = arrayOfByte1[i2];
        i2 += 1;
        arrayOfByte2 = new byte[i3];
        System.arraycopy(arrayOfByte1, i2, arrayOfByte2, 0, i3);
        ((p)localObject).setWord(arrayOfByte2);
        i2 += i3;
        int i4 = arrayOfByte1[i2];
        i3 = i2 + 1;
        i2 = i3;
        if (i4 > 0)
        {
          arrayOfByte2 = new byte[i4];
          System.arraycopy(arrayOfByte1, i3, arrayOfByte2, 0, i4);
          ((p)localObject).setMeaning(arrayOfByte2);
          i2 = i3 + i4;
        }
        this.k.add(localObject);
        i1 += 1;
        i2 += 2;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public int d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.i))
      return -1;
    return this.h[paramInt];
  }

  public final boolean d()
  {
    return this.a;
  }

  public o e(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= f))
      return null;
    return (o)this.g.get(paramInt);
  }

  public void e()
  {
    if (this.a);
    for (boolean bool = false; ; bool = true)
    {
      this.a = bool;
      SharedPreferences.Editor localEditor = MyApplication.b.edit();
      localEditor.putBoolean("showPrefix", this.a);
      localEditor.commit();
      return;
    }
  }

  public p f(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.j))
      return null;
    return (p)this.k.get(paramInt);
  }

  public final boolean f()
  {
    return this.b;
  }

  public void g()
  {
    if (this.b);
    for (boolean bool = false; ; bool = true)
    {
      this.b = bool;
      SharedPreferences.Editor localEditor = MyApplication.b.edit();
      localEditor.putBoolean("etyma_show_meaning", this.b);
      localEditor.commit();
      return;
    }
  }

  public void g(int paramInt)
  {
    this.c = paramInt;
    SharedPreferences.Editor localEditor = MyApplication.b.edit();
    localEditor.putInt("etyma_book_mark", paramInt);
    localEditor.commit();
  }

  public final int h()
  {
    return this.c;
  }
}

/* Location:           E:\桌面\classes-dex2jar.jar
 * Qualified Name:     com.ghosun.dict.d.b
 * JD-Core Version:    0.6.2
 */