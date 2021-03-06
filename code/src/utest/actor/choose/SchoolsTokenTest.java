/*
 * 
 * Copyright (c) 2010 Tom Parker <thpr@users.sourceforge.net>
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */
package actor.choose;

import pcgen.cdom.base.Chooser;
import pcgen.cdom.identifier.SpellSchool;

import actor.testsupport.AbstractPersistentChoiceActorTestCase;
import org.junit.Test;
import plugin.lsttokens.choose.SchoolsToken;

public class SchoolsTokenTest extends
		AbstractPersistentChoiceActorTestCase<SpellSchool>
{

	static final SchoolsToken pca = new SchoolsToken();

	@Test
	public void testEmpty()
	{
		// Just to get Eclipse to recognize this as a JUnit 4.0 Test Case
	}

	@Override
	public Chooser<SpellSchool> getActor()
	{
		return pca;
	}

	@Override
	protected SpellSchool getObject()
	{
		return context.getReferenceContext()
			.constructNowIfNecessary(SpellSchool.class, ITEM_NAME);
	}
}
