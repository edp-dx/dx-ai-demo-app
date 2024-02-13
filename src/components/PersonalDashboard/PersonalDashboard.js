import React from 'react';
import BadgesDashboard from '../BadgesDashboard/BadgesDashboard';

function PersonalDashboard() {
  // Assuming that badges are fetched and stored in the state of PersonalDashboard
  // Otherwise, the BadgesDashboard component should fetch its own badges
  // const [badges, setBadges] = useState([]);

  return (
    <div>
      {/* Other personal dashboard content */}
      <BadgesDashboard /* badges={badges} */ />
    </div>
  );
}

export default PersonalDashboard;